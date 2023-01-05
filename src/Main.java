public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(ageAndTemperature(23, 4));
        System.out.println("");
        System.out.println(ageAndTemperature(14, -40));
        System.out.println("");
        System.out.println(ageAndTemperature(54, -15));
        System.out.println("");
        System.out.println(ageAndTemperature(17, 25));
        System.out.println("");
        System.out.println(ageAndTemperature(2, -5));



        System.out.println("");
        System.out.println(ageAndTemperature(generateRandomAge(0, 99), 10));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if (20 < age && age < 45){
            if (-20 < temperature && temperature < 30){
                System.out.println("Можно идти гулять");
            }
        }

        if (age < 20){
            if (0 < temperature && temperature < 28){
                System.out.println("Можно идти гулять");
            }
        }

        if (45 < age){
            if (-10 < temperature && temperature < 45){
                System.out.println("Можно идти гулять");
            }
        }

        else {
            System.out.println("Оставайтесь дома");
        }

        String data = "Возраст человека = " + age + " Температура на улице = " + temperature;
        return data;
    }



    public static int generateRandomAge(int min, int max){
        int x = (int) ((Math.random() * (max - min + 1)) + min);
        return x;
    }
}
