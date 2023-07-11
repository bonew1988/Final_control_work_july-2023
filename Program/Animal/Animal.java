// package Java;
public abstract class Animal {

    private int id;
    private String type;
    private String name;
    private String birthdate;
    private String order;

    public Animal(int id, String type, String name, String birthdate, String order) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.birthdate = birthdate;
        this.order = order;
    }

    public int getId() {
        return id;
    }


    public String getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public String setOrder(String order) {
    return this.order = order;
    }

    public String getBirthdate() {
        return birthdate;
    }


    @Override
    public String toString() {
        return String.format("id: %d\nТип: %s\nРод: %s\nКличка: %s\nРожден: %s\nКоманды: %s\n", id, type, this.getClass().getSimpleName(), name, birthdate, order);

    }
}