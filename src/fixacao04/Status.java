package fixacao04;

public enum Status {
INICIADA("iniciada"), DELEGADA("delegada"), FINALIZADA("finalizada");

private String value;

private Status(String value){
    this.value = value;
}

public String getValue(){
    return this.value;
}



}
