 

  enum SwitchEnum {
   JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC; 
}

class UseSwitch{
    public static void main(String []args){
        SwitchEnum se=SwitchEnum.JUN;
        switch(se){
            case JAN:
                System.out.println("JAN");
                break;
            case FEB:
                System.out.println("FEB");
                break;
            case MAR:
                System.out.println("MAR");
                break;
            case APR:
                System.out.println("APR");
                break;
            case MAY:
                System.out.println("MAY");
                break;
            case JUN:
                System.out.println("JUN");
                break;
            case JUL:
                System.out.println("JUL");
                break;
            case AUG:
                System.out.println("AUG");
                break;
            case SEP:
                System.out.println("SEP");
                break;
            case OCT:
                System.out.println("OCT");
                break;
            case NOV:
                System.out.println("NOV");
                break;
            case DEC:
                System.out.println("DEC");
                break;
        }

        SwitchEnum s=SwitchEnum.valueOf("JUN");
        System.out.println(s);

    }
}