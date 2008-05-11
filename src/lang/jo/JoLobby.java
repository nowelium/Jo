package lang.jo;


public enum JoLobby {
    
    Object(JoObject.class),
    Number(JoNumber.class),
    String(JoString.class),
    List(JoList.class),
    Call(JoCall.class),
    System(JoSystem.class);

    private Class<? extends JoObject> ioClass;
    private JoObject instance;
    private JoLobby(Class<? extends JoObject> clazz){
        ioClass = clazz;
        instance = JoObject.ioSelf().getSlot(clazz.getSimpleName()).getBlock().call(null, null);
    }
    public Class<? extends JoObject> getIoClass(){
        return ioClass;
    }
    public JoObject getObject(){
        return instance;
    }
}
