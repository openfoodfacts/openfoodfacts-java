package pl.coderion;
import pl.coderion.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;

public class ProductTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testOwnerDeserialization() throws Exception {
        // 1. Create a "fake" JSON string like the API returns
        String json = "{\"owner\": \"Ferrero\"}";

        // 2. Tell Jackson to turn that JSON into a Product object
        Product product = mapper.readValue(json, Product.class);

        // 3. The Moment of Truth: Does getOwner() return "Ferrero"?
        assertEquals("Ferrero", product.getOwner(), "The owner field should be correctly mapped from JSON");
    }

    @Test
    public void testOwnerFieldsDeserialization() throws Exception {
        // 1. JSON with a nested object for owner_fields
        String json = "{" +
                    "\"owner\": \"Ferrero\"," +
                    "\"owner_fields\": {\"1\": 1724673898, \"2\": 1724673898}" +
                    "}";

        Product product = mapper.readValue(json, Product.class);

        // 2. Verify the basic field
        assertEquals("Ferrero", product.getOwner());

        // 3. Verify the Map exists and has the right data
        assertNotNull(product.getOwnerFields());
        assertEquals(1724673898, product.getOwnerFields().get("1"));
        assertEquals(2, product.getOwnerFields().size());
    }

    @Test
    public void testOwnersTags() throws Exception {
        // Note: No square brackets here, just like the raw data
        String json = "{\"owners_tags\": \"org-ferrero-france-commerciale\"}";

        Product product = mapper.readValue(json, Product.class);

        assertEquals("org-ferrero-france-commerciale", product.getOwnersTags());
    }

    @Test
    public void testFullOwnershipMapping() throws Exception {
        String json = "{" +
                    "\"owner\": \"Ferrero\"," +
                    "\"owner_fields\": {\"1\": 1724673898}," +
                    "\"owner_imported\": \"2023-01-19 14:04:52\"," +
                    "\"owners_tags\": \"org-ferrero-france-commerciale\"" +
                    "}";

        Product product = mapper.readValue(json, Product.class);

        assertEquals("Ferrero", product.getOwner());
        assertEquals("2023-01-19 14:04:52", product.getOwnerImported());
        assertEquals("org-ferrero-france-commerciale", product.getOwnersTags());
        assertNotNull(product.getOwnerFields());
        assertEquals(1724673898, product.getOwnerFields().get("1"));
    }

    @Test
    public void testPartialOwnershipMapping() throws Exception {
        // Only 'owner' is present here
        String json = "{\"owner\": \"Nestle\"}";

        Product product = mapper.readValue(json, Product.class);

        assertEquals("Nestle", product.getOwner());
        assertNull(product.getOwnersTags(), "Field should be null if not in JSON");
        assertNull(product.getOwnerFields(), "Map should be null if not in JSON");
    }

    @Test
    public void testOwnerFieldsVersatility() throws Exception {
        String json = "{\"owner_fields\": {\"version\": \"v2\", \"count\": 42, \"active\": true}}";

        Product product = mapper.readValue(json, Product.class);

        Map<String, Object> fields = product.getOwnerFields();
        assertEquals("v2", fields.get("version"));
        assertEquals(42, fields.get("count"));
        assertEquals(true, fields.get("active"));
    }
}