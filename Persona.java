import java.util.Random;

public abstract class Persona {
    private String nombre;
    private boolean atributo1nombre;
    private boolean atributo2apellido;
    private boolean atributo3edad;
    private boolean atributo4sexo;

    public Persona(String nombre) {
        this.nombre = nombre;
        Random rand = new Random();
        this.atributo1nombre = rand.nextBoolean();
        this.atributo2apellido = rand.nextBoolean();
        this.atributo3edad = rand.nextBoolean();
        this.atributo4sexo = rand.nextBoolean();
        while (this.sonTodosLosAtributosIguales()) {
            this.atributo1nombre = rand.nextBoolean();
            this.atributo2apellido = rand.nextBoolean();
            this.atributo3edad = rand.nextBoolean();
            this.atributo4sexo = rand.nextBoolean();
        }
    }

    public boolean isAtributo1() {
        return atributo1nombre;
    }

    public void setAtributo1(boolean atributo1) {
        this.atributo1nombre = atributo1;
    }

    public boolean isAtributo2() {
        return atributo2apellido;
    }

    public void setAtributo2(boolean atributo2) {
        this.atributo2apellido = atributo2;
    }

    public boolean isAtributo3() {
        return atributo3edad;
    }

    public void setAtributo3(boolean atributo3) {
        this.atributo3edad = atributo3;
    }

    public boolean isAtributo4() {
        return atributo4sexo;
    }

    public void setAtributo4(boolean atributo4) {
        this.atributo4sexo = atributo4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private boolean sonTodosLosAtributosIguales() {
        return this.atributo1nombre == this.atributo2apellido && this.atributo2apellido == this.atributo3edad && this.atributo3edad == this.atributo4sexo;
    }
}

class Persona1 extends Persona {
    public Persona1(String nombre) {
        super(nombre);
    }
}

class Persona2 extends Persona {
    public Persona2(String nombre) {
        super(nombre);
    }
}

class Persona3 extends Persona {
    public Persona3(String nombre) {
        super(nombre);
    }
}

class Persona4 extends Persona {
    public Persona4(String nombre) {
        super(nombre);
    }
}

class Persona5 extends Persona {
    public Persona5(String nombre) {
        super(nombre);
    }
}

class Persona6 extends Persona {
    public Persona6(String nombre) {
        super(nombre);
    }
}

class Persona7 extends Persona {
    public Persona7(String nombre) {
        super(nombre);
    }
}

class Persona8 extends Persona {
    public Persona8(String nombre) {
      super(nombre);
    }
}