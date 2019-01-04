package sut.se.g16;

import sut.se.g16.Entity.*;
import sut.se.g16.Repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.stream.Stream;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CustomerRepository customerRepository , NationalityRepository nationalityRepository, SexRepository sexRepository, TitleNameRepository titleNameRepository){

		return args -> {
			Stream.of("Male","Female").forEach(sex ->{
				if(sex.equals("Male")){
					SexEntity sexEntity = new SexEntity();
					sexEntity.setSexType("Male");
					sexRepository.save(sexEntity);
				}
				if(sex.equals("Female")){
					SexEntity sexEntity = new SexEntity();
					sexEntity.setSexType("Female");
					sexRepository.save(sexEntity);
				}
			});

			Stream.of("Miss","Mrs.","Mr.").forEach(title ->{
				if(title.equals("Miss")){
					TitleNameEntity titleNameEntity = new TitleNameEntity();
					titleNameEntity.setTitlenameType("Miss");
					titleNameRepository.save(titleNameEntity);
				}
				if(title.equals("Mrs.")){
					TitleNameEntity titleNameEntity = new TitleNameEntity();
					titleNameEntity.setTitlenameType("Mrs.");
					titleNameRepository.save(titleNameEntity);
				}
				if(title.equals("Mr.")){
					TitleNameEntity titleNameEntity = new TitleNameEntity();
					titleNameEntity.setTitlenameType("Mr.");
					titleNameRepository.save(titleNameEntity);
				}
			});

			Stream.of("Australian","Belgian","Brazilian","Cambodian","Canadian","Chinese","Danish",
					"Egyptian","English","Finnish","French","German","Greek","Indonesian",
					"Iranian","Irish","Israeli","Italian","Laotian","Malaysian","Mexican",
					"Dutch","New Zealander","Norwegian","Filipino","Portuguese","Romanian","Russian",
					"Korean","Spanish","Norwegian","Swedish","Swiss","Thai","British",
					"American","Vietnamese").forEach(nationality ->{
				if(nationality.equals("Australian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Australian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Belgian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Belgian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Brazilian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Brazilian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Cambodian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Cambodian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Canadian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Canadian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Chinese")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Chinese");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Danish")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Danish");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Egyptian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Egyptian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("English")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("English");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Finnish")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Finnish");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("French")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("French");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("German")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("German");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Greek")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Greek");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Indonesian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Indonesian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Irish")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Irish");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Israeli")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Israeli");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Italian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Italian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Japanese")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Japanese");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Laotian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Laotian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Malaysian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Malaysian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Mexican")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Mexican");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Dutch")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Dutch");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("New Zealander")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("New Zealander");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Norwegian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Norwegian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Romanian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Romanian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Russian")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Russian");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Korean")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Korean");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Spanish")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Spanish");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Swedish")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Swedish");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Swiss")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Swiss");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Thai")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Thai");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("British")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("British");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("American")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("American");
					nationalityRepository.save(nationalityEntity);
				}
				if(nationality.equals("Vietnamese")){
					NationalityEntity nationalityEntity = new NationalityEntity();
					nationalityEntity.setNationalityName("Vietnamese");
					nationalityRepository.save(nationalityEntity);
				}
			});
		};
	}
}
