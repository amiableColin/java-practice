package chap_07_class;

public class BlackBox {
    static int cnt = 0; // 클래스 변수. (static 키워드로 만들어짐. 해당 클래스의 모든 인스턴스들은 해당 변수를 공유함.)
    private String modelName;
    private String resolution;
    private int price;
    private String color;

    public BlackBox() { // 기본 생성자.
        this("기본 모델.", "HD", 50_000, "회색"); // 사용자 정의 생성자를 호출. this() 메서드를 사용할 때는 반드시 생성자의 최상단에 위치 필요.
        System.out.println("기본 생성자 호출");
        System.out.println("현재 만들어진 제품 수 : " + (++BlackBox.cnt));
    }

    public BlackBox(String modelName, String resolution, int price, String color) {
//        this();     // 기본 생성자 호출. 반드시 사용자 정의 생성자의 최상단에 위치하여야 함.
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
        this.printData();
    }

    void record(boolean showDatetime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDatetime)   // 날짜정보 표시 여부
            System.out.println("영상에 날짜정보가 표시됩니다.");
        if (showSpeed)      // 속도정보 표시 여부
            System.out.println("영상에 속도정보가 표시됩니다.");
                            // min: 영상 기록 단위(분)
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    void record() { // 메서드 오버로딩: 파라미터의 타입이나 개수가 다르면 가능.
        System.out.println("-- 기능 지정이 되지 않아 디폴트 모드로 동작합니다. --");
        this.record(true, false, 5);
    }

    static void callServiceCenter() { // 클래스 메서드. 인스턴스 변수, 클래스에 접근 불가. 클래스 변수에만 접근 가능.
        cnt = 15;
        System.out.println("클래스 변수 cnt가 " + cnt + "로 임의 변경되었습니다. (클래스 변수 접근 가능 여부 확인)");
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price <= 0 ? 50_000 : price;  // 음수나 0이 들어오는 것을 대비해 디폴트 값 삽입.
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printData() {
        System.out.printf("모델명: %s\n해상도: %s\n가격: %d\n색상: %s\n",this.modelName, this.resolution, this.price, this.color);
    }

    public void appendModelName(String s) { // 인스턴스 변수와 전달받은 파라미터의 이름이 같으면 this 키워드가 반드시 필요하나, 다르다면 this 생략 가능.
        this.modelName += s;
    }
}
