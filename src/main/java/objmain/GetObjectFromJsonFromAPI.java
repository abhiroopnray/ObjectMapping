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
            apiFetchModel = objectMapper.readValue(new URL("https://jsonplaceholder.typicode.com/todos/1"), ApiFetchModel.class);
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

        String id = apiFetchModel.getId();
        String userId = apiFetchModel.getUserId();
        String tittle = apiFetchModel.getTitle();
        boolean completed = apiFetchModel.getCompleted();

        System.out.println("\n" + "From API: " + "\n" + "Id: " + id + "\n" + "UserId: " + userId + "\n" + "tittle: " + tittle + "\n" + "completed: " + completed);
        System.out.println("\nShowing only one item. \nTotal list size: " + apiFetchModelList.size());
        storeData(apiFetchModel);
    }

    private void storeData(ApiFetchModel apiFetchModel){
        try {
            objectMapper.writeValue(new File("D:\\Personal\\RTFS\\ObjectMapper\\ExtraFiles\\OBJ_01_\\api_fetch.json"), apiFetchModel);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
