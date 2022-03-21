public enum WeeksDays {//обычный класс, перечисление, через запятую, в конце перечисления точка с запятой
    MONDAY("mon"),
    TUESDAY("tue"),
    WENDESDAY("wen"),
    THUSDAY("thu"),
    FRIDAY("fri"),
    SATURDAY("sat"),
    SUNDAY("sun");

    private String code;

    WeeksDays(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;// будет браться то что в кавычках
    }

}
