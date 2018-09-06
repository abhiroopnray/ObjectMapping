package objmain;

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

        //Data add
        CarModel carModel = new CarModel("Abhishek Chakraborty", "Ford", "EcoSport", "White", "1500");

        printData(carModel);

        try {
            //From code
            objectMapper.writeValue(new File("D:\\Personal\\RTFS\\ObjectMapper\\ExtraFiles\\OBJ_01_\\car.json"), carModel);

        } catch (IOException e) {
            System.out.println(e.toString());
        }
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
