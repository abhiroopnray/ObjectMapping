package objmain;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import objmodel.ApiFetchModel;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class GetObjectFromJsonFromAPI {

    private ObjectMapper objectMapper = null;
    private ApiFetchModel apiFetchModel;
    private List<ApiFetchModel> apiFetchModelList;

    public GetObjectFromJsonFromAPI() {
        apiFetchModel = new ApiFetchModel();
        objectMapper = new ObjectMapper();

    }

    public void fetchDataFromApi() {
        try {

            //For single item without pagination
            apiFetchModel = objectMapper.readValue(new URL("https://jsonplaceholder.typicode.com/todos/1"),
                    ApiFetchModel.class);

            //For list
            apiFetchModelList = objectMapper.readValue(new URL("https://jsonplaceholder.typicode.com/todos/"),
                    new TypeReference<List<ApiFetchModel>>(){});

            printAPIData();
        } catch (IOException e) {
            System.out.println("Exception in json to obj: " + e);
        } catch (NullPointerException e) {
            System.out.println("Exception in json to obj: " + e);
        }

    }

    private void printAPIData() {

        for (int i = 0; i < apiFetchModelList.size(); i++) {

            System.out.println("\n" + "From API: " + "\n" + "Id: " + apiFetchModelList.get(i).getId()
                    + "\n" + "UserId: " + apiFetchModelList.get(i).getUserId()
                    + "\n" + "tittle: " + apiFetchModelList.get(i).getTitle()
                    + "\n" + "completed: " + apiFetchModelList.get(i).getCompleted());
        }
        //System.out.println("\nTotal list size: " + apiFetchModelList.size());
        storeData(apiFetchModel);
    }

    private void storeData(ApiFetchModel apiFetchModel){
        try {
            objectMapper.writeValue(new File("D:\\Personal\\RTFS\\ObjectMapper\\ExtraFiles\\OBJ_01_\\api_fetch.json"), apiFetchModelList);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
