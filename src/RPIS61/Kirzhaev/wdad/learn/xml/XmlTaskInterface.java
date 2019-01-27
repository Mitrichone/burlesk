package RPIS61.Kirzhaev.wdad.learn.xml;

import javax.xml.transform.TransformerException;

public interface XmlTaskInterface {
    /*возвращающий сумму, которую необходимо оплатить владельцам заданной квартиры.
    Счет определяется разницей показаний счетчиков за
    текущий месяц и предыдущий. Тарифы определены
    так же в xml-документе.*/
    double getBill (String street,
                    int buildingNumber,
                    int flatNumber,
                    int month,
                    int year)  throws FindException;

    /* изменяющий стоимость заданной единицы показания счетчика (ХВС, ГВС, электроэнергия, газ). */
    void setTariff (String tariffName,
                    double newValue)  throws TransformerException;

    /* добавляющий показания счетчиков к
    заданной квартире в заданный период.*/
    void addRegistration (String street,
                          int buildingNumber,
                          int flatNumber,
                          int year,
                          int month,
                          double coldWater,
                          double hotWater,
                          double electricity,
                          double gas)  throws TransformerException, FindException;
}
