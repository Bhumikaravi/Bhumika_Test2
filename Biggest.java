class Biggest {

    private int[] num;
    public Biggest(int[] numbers) {
        this.num = numbers;
    }
    public void display() {
        if (num== null || num.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int l = num[0];
        for (int n : num) {
            if (n > l) {
                l = n;
            }
        }
        System.out.println("The largest element in the array is: " + l);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 25};
        Biggest b = new Biggest(arr);
        b.display();
    }
}