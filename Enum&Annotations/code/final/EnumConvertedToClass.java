 

 enum EnumConvertedToClass {
INDIA, USA, CHINA, RUSSIA, PAKISTAN;  //public static final EnumConvertedToClass INDIA = new EnumConvertedToClass();

// EnumConvertedToClass e=new EnumConvertedToClass(); //not possible
//instead of above line we can use EnumConvertedToClass e=EnumConvertedToClass.INDIA; 
 

int latitude;
int longitude;

EnumConvertedToClass() {
System.out.println("Constructor Called");
}

void setLatitude(int latitude) {
this.latitude = latitude;
}

void setLongitude(int longitude) {
this.longitude = longitude;
}

int getLatitude() {
return latitude;
}

int getLongitude() {
return longitude;
}


int [] location() {
    return new int[] {getLatitude(), getLongitude()};
}

public static void main(String []args){

}

//super implementation of toString() method in Enum class
//public String toString() {
//    return name();
//}

 }

 class LaunchEnumConvertedToClass  {

 public static final LaunchEnumConvertedToClass INDIA = new LaunchEnumConvertedToClass();
 public static final LaunchEnumConvertedToClass USA = new LaunchEnumConvertedToClass();
 public static final LaunchEnumConvertedToClass CHINA = new LaunchEnumConvertedToClass();
 public static final LaunchEnumConvertedToClass RUSSIA = new LaunchEnumConvertedToClass();
 public static final LaunchEnumConvertedToClass PAKISTAN = new LaunchEnumConvertedToClass();

 int latitude;
int longitude;

LaunchEnumConvertedToClass() {
System.out.println("Constructor Called");
}

void setLatitude(int latitude) {
this.latitude = latitude;
}

void setLongitude(int longitude) {
this.longitude = longitude;
}

int getLatitude() {
return latitude;
}

int getLongitude() {
return longitude;
}


int [] location() {
    return new int[] {getLatitude(), getLongitude()};
}

//overriding toString() method to return the name of the current object created 
public String toString() {
    if(this == INDIA) {
        return "INDIA";
    } else if(this == USA) {
        return "USA";
    } else if(this == CHINA) {
        return "CHINA";
    } else if(this == RUSSIA) {
        return "RUSSIA";
    } else if(this == PAKISTAN) {
        return "PAKISTAN";
    } else {
        return "UNKNOWN";
    }
     
 }
}