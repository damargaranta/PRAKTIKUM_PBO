public class BangunRuang {
    private String name;


    public void inputNilai(){

        System.out.println("Input nilai");
    }

    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun Ruang" + getName());
    }

    public void volume(){

        System.out.println("Menghitung volume bangun Ruang" + getName());
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }
}
