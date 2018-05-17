package telran.persons.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import telran.persons.api.PersonsApiConstants;
import telran.persons.dto.Person;

public class PersonsWebProxy implements IPersons {
	RestTemplate restTemplate = new RestTemplate();
	String url;
	HttpHeaders headers = new HttpHeaders();

	public PersonsWebProxy(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public HttpHeaders getHeaders() {
		return headers;
	}

	public void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}

	@Override
	public boolean addPerson(Person person) {
		HttpEntity<Person> postEntity = new HttpEntity<>(person, headers);
		ResponseEntity<Boolean> response = restTemplate.exchange(url + PersonsApiConstants.ADD_PERSON, HttpMethod.POST,
				postEntity, Boolean.class);
		return response.getBody();
	}

	@Override
	public void addPersons(Iterable<Person> persons) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> getPersonsByDates(LocalDate dateFronm, LocalDate dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getEmployeesByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getChildrenByKindergarten(String kindergarten) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getEmployeesBySalary(int salaryFrom, int salaryTo) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public boolean addPerson(Person person) {
	// HttpEntity<Person> postEntity = new HttpEntity<>(person, headers);
	// ResponseEntity<Boolean> response = restTemplate.exchange(url +
	// PersonsApiConstants.ADD_PERSON, HttpMethod.POST,
	// postEntity, Boolean.class);
	// return response.getBody();
	// }
	//
	// @Override
	// public Person getPerson(int id) {
	// HttpEntity<String> requestEntity = new HttpEntity<>(headers);
	// ResponseEntity<Person> response = restTemplate.exchange(url +
	// PersonsApiConstants.GET_PERSON + "?" + "id=" + id,
	// HttpMethod.GET, requestEntity, Person.class);
	// return response.getBody();
	// }
	//
	// @Override
	// public boolean updateName(int id, String newName) {
	// HttpEntity<NamesBox> postEntity = new HttpEntity<NamesBox>(new NamesBox(id,
	// newName), headers);
	// ResponseEntity<Boolean> response = restTemplate.exchange(url +
	// PersonsApiConstants.UPDATE_NAME, HttpMethod.POST,
	// postEntity, Boolean.class);
	// return response.getBody();
	// }
	//
	// @Override
	// public boolean removePerson(int id) {
	// HttpEntity<Integer> postEntity = new HttpEntity<Integer>(id, headers);
	// ResponseEntity<Boolean> response = restTemplate.exchange(url +
	// PersonsApiConstants.REMOVE_PERSON,
	// HttpMethod.POST, postEntity, Boolean.class);
	// return response.getBody();
	// }

}
