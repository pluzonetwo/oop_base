package task2;

class Rectangle {
    private Integer width = 20;
    private Integer height = 10;

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer calculateArea() {
        Integer result;
        result = width * height;
        return result;
    }

    public Integer calculatePerimeter() {
        Integer result;
        result = 2 * (width + height);
        return result;
    }

    public void printRectangle() {
        System.out.println(
                "Высота прямоугольника: " + height + "\n" +
                        "Ширина прямоугольника: " + width + "\n" +
                        "Площадь прямоугольника: " + calculateArea() + "\n" +
                        "Периметр прямоугольника: " + calculatePerimeter());
    }
}