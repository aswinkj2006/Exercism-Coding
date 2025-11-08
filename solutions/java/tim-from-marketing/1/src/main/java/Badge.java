class Badge {
    public String print(Integer id, String name, String department) {
        if ( id == null && department != null ){
            String message = name+" - "+ department.toUpperCase();
            return message;
        }else if ( department == null && id != null ) {
            String message = "["+id+"]"+" - "+name+" - OWNER";    
            return message;
        }else if ( department == null && id == null ) {
            String message = name+" - OWNER";    
            return message;
        }
        else{
            String message = "["+id+"]"+" - "+ name+" - "+ department.toUpperCase();
            return message;
        }
    }
}

