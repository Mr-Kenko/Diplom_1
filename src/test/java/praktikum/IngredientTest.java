package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTest {
    IngredientType type;
    String name;
    float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters
    public static Object[][] getBunTestData() {
        return new Object[][] {
                {IngredientType.SAUCE,"Соус фирменный Space Sauce",80F},
                {IngredientType.FILLING,"Плоды Фалленианского дерева",874f },
                {IngredientType.FILLING,"Хрустящие минеральные кольца",300F },
        };
    }
    @Test
    public void getIngredientType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(ingredient.type, ingredient.getType());
    }
    @Test
    public void getIngredientName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(ingredient.name, ingredient.getName());
    }
    @Test
    public void getIngredientPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(ingredient.price, ingredient.getPrice(), 0);
    }
}