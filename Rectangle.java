class Rectangle {

    private double length;
    private double width;

    // Default constructor initializing
    // length and width to 1
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor to
    // initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }
    public double calculateArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Default Area: " + rectangle.calculateArea());

        rectangle.setLength(5);
        rectangle.setWidth(4);
        System.out.println("Updated Area: " + rectangle.calculateArea());

        Rectangle customRectangle = new Rectangle(7, 3);
        System.out.println("Custom Area: " + customRectangle.calculateArea());
    }
}

