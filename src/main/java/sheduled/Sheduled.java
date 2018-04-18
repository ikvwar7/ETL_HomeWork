package sheduled;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.liga.domain.Car;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Component
public class Sheduled {
    final String xmlPath = "C:\\Users\\123\\Documents\\JavaLige\\day_14\\dz_1\\src\\main\\resources\\cars";
    final String suvsDir = "C:\\Users\\123\\Documents\\JavaLige\\day_14\\dz_1\\src\\main\\resources\\suvs";
    final String trucksDir = "C:\\Users\\123\\Documents\\JavaLige\\day_14\\dz_1\\src\\main\\resources\\trucks";

    @Scheduled(fixedRate = 10000)
    public void findCars() throws IOException, JAXBException {
        Stream<Path> stream = Files.walk(Paths.get(xmlPath));
        JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ObjectMapper objectMapper = new ObjectMapper();

        stream.filter(Files::isRegularFile).forEach(path -> {
            try {
                Car car = (Car) unmarshaller.unmarshal(path.toFile());
                if (car.getType().equals("truck")) {
                    objectMapper.writeValue(new File(trucksDir + "\\" + car.getVin()+".json"), car);
                    path.toFile().delete();
                } else if (car.getType().equals("suv")) {
                    objectMapper.writeValue(new File(suvsDir + "\\" + car.getVin()+".json"), car);
                    path.toFile().delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
    }
}
