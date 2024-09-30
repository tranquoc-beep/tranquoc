import java.util.Random;

    public class ex3 {
        public static void main(String[] args) {
            Random random = new Random();
            int randomInt = random.nextInt();
            System.out.println("Random Int: " + randomInt);
            int boundedInt = random.nextInt(100);
            System.out.println("Random Int (0-99): " + boundedInt);
            double randomDouble = random.nextDouble();
            System.out.println("Random Double: " + randomDouble);
            float randomFloat = random.nextFloat();
            System.out.println("Random Float: " + randomFloat);
            long randomLong = random.nextLong();
            System.out.println("Random Long: " + randomLong);
            boolean randomBoolean = random.nextBoolean();
            System.out.println("Random Boolean: " + randomBoolean);
            double randomGaussian = random.nextGaussian();
            System.out.println("Random Gaussian: " + randomGaussian);
            byte[] randomBytes = new byte[10];
            random.nextBytes(randomBytes);
            System.out.print("Random Bytes: ");
            for (byte b : randomBytes) {
                System.out.print(b + " ");
            }
            System.out.println();
            random.setSeed(12345);
            int seededInt = random.nextInt(100);
            System.out.println("Random Int with Seed (0-99): " + seededInt);
            int randomInRange = random.nextInt(50) + 50;
            System.out.println("Random Int (50-99): " + randomInRange);
        }
    }


