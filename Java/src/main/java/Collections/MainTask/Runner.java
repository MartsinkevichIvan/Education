package Collections.MainTask;

import Collections.MainTask.Accessories.Accessories;
import Collections.MainTask.Enums.Freshness;
import Collections.MainTask.Enums.StemsLength;
import Collections.MainTask.Flowers.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Flower> flowers = Arrays.asList(
                new Rose(StemsLength.HUNDRED, Freshness.ONEDAY),
                new Peony(StemsLength.EIGTHTY, Freshness.FOURDAYS),
                new Peony(StemsLength.NINETY, Freshness.OVERFIVEDAYS),
                new Tulip(StemsLength.EIGTHTY, Freshness.TWODAYS),
                new Sunflower(StemsLength.SIXTY, Freshness.THREEDAYS));
        List<Accessories> accessories = Arrays.asList(
                Accessories.PAPER,
                Accessories.RIBBON);
        Bouquet bouquet = new Bouquet(flowers, accessories);
        Collections.sort(bouquet.getFlowersList());
        System.out.print("Найти цветок в букете, соответствующий заданному диапазону длин стеблей: ");
        bouquet.findFlowerByStemsLengthRange(60, 80);
        System.out.printf("Total cost of bouquet is %.2f.", bouquet.countTotalPrice());
    }
}
