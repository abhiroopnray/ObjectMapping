package objmain;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import objmodel.ApiFetchModel;
import objmodel.CarModel;

import java.io.File;
import java.io.IOException;

public class GetObjectFromJSON {


    private ObjectMapper objectMapper = null;

    public GetObjectFromJSON() {
        objectMapper = new ObjectMapper();
    }

    public void objectToJsonCarModel() {

        ObjectMapper objectMapper = new ObjectMapper();
        CarModel carModel = new CarModel();/*("Abhishek Chakraborty", "Ford",
                "EcoSport", "White", "1500");*/

        String rawJson = "{\"owner\" : \"Abhishek Chakraborty\", " +
                "\"company\" : \"Ford\", " +
                "\"model\" : \"EcoSport\", " +
                "\"color\" : \"white\", " +
                "\"power\" : \"1500\"}";

        carModel.setOwner("Abhishek");
        carModel.setCompany("Ford");
        carModel.setModel("EcoSport");
        carModel.setColor("White");
        carModel.setPower("1500");

        //JSON to JACKSON JsonNode
        JsonNode jsonNode = null;
        try {
           jsonNode = objectMapper.readTree(rawJson);
        }catch (IOException e){
            e.printStackTrace();
        }

        String ownerName = jsonNode.get("owner").asText();
        printJacksonNodeData(ownerName);

        printData(carModel);

        try {
            //Store data in file
            objectMapper.writeValue(new File("D:\\Personal\\RTFS\\ObjectMapper\\ExtraFiles\\OBJ_01_\\car.json"), carModel);

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private void printJacksonNodeData(String jsonNode){
        System.out.println("\n" +  "Json Node: Owner name: " + jsonNode);
    }

    private void printData(CarModel carModel){
        String owner = carModel.getOwner();
        String company = carModel.getCompany();
        String model = carModel.getModel();
        String color = carModel.getColor();
        String power = carModel.getPower();

        System.out.println("\n" + "Owner: " + owner + "\n" + "Company:" + company + "\n" + "model: " + model + "\n" + "color: " + color + "\n" + "power: " + power);
    }

}
