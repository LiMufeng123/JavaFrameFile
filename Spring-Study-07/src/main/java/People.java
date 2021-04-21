import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;

public class People {
    private String name;

    private Cat cat;
    @Autowired
    private Dog dog;
    @Autowired
    private Giao giao;

    public Cat getCat(){
        return cat;
    }
    public Giao getGiao() {
        return giao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setCat(Cat cat1) {
        this.cat = cat1;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setGiao(Giao giao) {
        this.giao = giao;
    }
}
