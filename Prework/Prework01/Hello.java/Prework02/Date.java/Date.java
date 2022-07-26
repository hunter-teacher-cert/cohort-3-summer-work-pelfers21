
class Date {

    public static void main(String[] args) {
        System.out.println("Hello, ");
        System.out.println("World!");
        String day = "Sunday";
        int date = 30;
        String month = "January";
        int year = 2022;
        System.out.println(day + " " + month + " " + date + " " + year);
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
        //American format: Thursday, July 18, 2019
        //European format: Thursday 18 July 2019
        System.out.println("American Format: " + day + "," + " " + month  + "," + " " + date + "," + " " + year);
        System.out.println("European Format: " + day + "," + " " + date  + "," + " " + month + "," + " " + year);
    }

}
