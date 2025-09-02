public class Oriented_task1_3 {
    public static void main (String[] args) throws InterruptedException {
        Customer customer1 = new Customer();
        customer1.setStartTime(System.currentTimeMillis());
        Thread.sleep(1000);
        customer1.setEndTime(System.currentTimeMillis());


        System.out.println("Customer 1 ID: " + customer1.getId());
        System.out.println("Start Time: " + customer1.getStartTime());
        System.out.println("End Time: " + customer1.getEndTime());
        System.out.println("Customer 1 total time spent: " + customer1.getTimeTotal());

        Customer customer2 = new Customer();
        customer2.setStartTime(System.currentTimeMillis());
        Thread.sleep(1000);
        customer2.setEndTime(System.currentTimeMillis());


        System.out.println("Customer 2 ID: " + customer2.getId());
        System.out.println("Start Time: " + customer2.getStartTime());
        System.out.println("End Time: " + customer2.getEndTime());
        System.out.println("Customer 1 total time spent: " + customer2.getTimeTotal());
    }
}
