package praktikum;

import org.junit.Test;

import org.junit.Assert;

public class IngredientTypeTest {

    @Test
    public void checkSauceIngredientType() {
        Assert.assertEquals("SAUCE", IngredientType.SAUCE.name());
    }
    @Test
    public void checkFillingIngredientType() {
        Assert.assertEquals("FILLING", IngredientType.FILLING.name());
    }
}