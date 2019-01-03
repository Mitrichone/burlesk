package RPIS61.Kirzhaev.wdad.learn.xml;

public class TestXmlTask {
    private static String path  = "..\\starting-monkey-to-human-path\\src\\RPIS61\\Kirzhaev\\wdad\\learn\\xml\\example.xml";
    public static void main(String[] args) throws Exception {
        XmlTask xml = new XmlTask(path);
        System.out.println(xml.getBill("Владимирская", 2, 2, 2, 2002));
        xml.setTariff("hotwater", 15);
        xml.addRegistration("Московская", 2, 2, 2002, 3, 50, 500, 500, 500);
    }
}
