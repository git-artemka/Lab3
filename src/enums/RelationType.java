package enums;

public enum RelationType {
    PARENT("родитель"),
    SISTER("сестру"),
    NEIGHBOR("Cоседка"),
    DOCTOR("Доктор"),
    FRIEND("друг"),
    PROTAGONIST("главная героиня");
    private final String relationType;
    RelationType(String relationType) {
        this.relationType = relationType;
    }

    @Override
    public String toString(){
        return relationType;
    }
}
