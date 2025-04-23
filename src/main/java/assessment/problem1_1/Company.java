package assessment.problem1_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Company {
    protected int companyIb; //회사 ID
    protected String companyName; //회사 이름
    protected String address; //주소
    protected String city; //도시
    protected String state; //주
    protected String zipCode; //우편 번호

    public void employee(){
        System.out.println("companyIb : " + companyIb);
        System.out.println("companyName : " + companyName);
        System.out.println("address : " + address);
        System.out.println("city : " + city);
        System.out.println("state : " + state);
        System.out.println("zipCode : "+ zipCode);
    }
}
