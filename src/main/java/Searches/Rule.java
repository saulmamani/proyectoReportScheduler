package Searches;

public class Rule {
    private String attribute;
    private String operator;
    private String value;

    public Rule(String attribute, String operator, String value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getOperator() {
        return operator;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return attribute + " " + operator + " " +value;
    }
}
