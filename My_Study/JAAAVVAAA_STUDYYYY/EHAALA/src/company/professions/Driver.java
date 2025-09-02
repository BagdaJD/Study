package company.professions;

public class Driver {
    private String fio;
    private int age;
    private String[] arrFio = new String[3];


    public Driver(String fio, int age){
        this.fio = fio;
        this.age = age;
    }

    public String[] getFio() {
        char[] charArr = fio.toCharArray();
        int j = 0;
        String str = "";
        for (int i = 0; i < charArr.length - 1; i++){
            if (String.valueOf(charArr[i])!= ""){
                str += charArr[i];
            }else{
                arrFio[j] = str;
                str = "";
                j++;
            }
        }
        return arrFio;
    }


}
