package immutablebuilder;


public class Person {
    private int name;
    private int id;

    private Person(Builder builder){
        this.name = builder.name;
        this.id = builder.id;
    }

    static Builder builder(){
        return new Builder();
    }

    static class Builder{
        private int name;
        private int id;

        public Builder name(int name){
            this.name = name;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


}
