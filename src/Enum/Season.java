package Enum;

public enum Season {
//	SPRING("春天","凉"),
//	SUMMER("夏天","热");
//	
//	private final String name;
//	private final String dsc;
//	
//	Season(String string, String string2) {
//		// TODO Auto-generated constructor stub
//		this.name = string;
//		this.dsc = string2;		
//	}
	
	SPRING("春天","一年之计在于春"),
	SUMMER("夏天","夏天好热 ~ "),
    FALL("秋天","秋水共长天一色"),
    WINTER("冬天","冬天好冷 ~ ");
	
	//Season SPRING111 = new Season("春天","一年之计在于春");

    // 添加枚举对象的名称
    private final String name;

    // 添加枚举对象的描述
    private final String desc;

    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

 }
