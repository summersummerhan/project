/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2part4;

/**
 *
 * @author 加藤鹰
 */
public class Community {
    String name;
    House house;



   public Community(){



   }


    public Community(String name, House house) {

        this.name = name;
        this.house = house;


    }

    @Override
    public String toString() {
        return "Community{" +
                "name='" + name + '\'' +
                //", house=" + house +
                '}';
    }



}
