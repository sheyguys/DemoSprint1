import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { CustomerServiceService } from '../service/customer-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  titlenameTypes: Array<any>;
  sexTypes: Array<any>;
  nationalityNames: Array<any>;
  views: any = {
    titlenameTypeSelect: null,
    nametInput: null,
    idcardInput: null,
    addressInput: null,
    emailInput: null,
    phoneInput: null,
    userInput: null,
    passwordInput: null,
    sexTypeSelect: null,
    nationalityNameSelect: null
  };

  constructor(private customerService: CustomerServiceService , private httpClient: HttpClient) { }

  ngOnInit() {
    this.customerService.getTitlenameType().subscribe(data => {
      this.titlenameTypes = data;
      console.log(data);
    });

    this.customerService.getSexType().subscribe(data => {
      this.sexTypes = data;
      console.log(data);
    });

    this.customerService.getNationalityName().subscribe(data => {
      this.nationalityNames = data;
      console.log(data);
    });

  }
  save_func(){

  this.customerService.checkEmail(this.views.emailInput).subscribe(data => {
    if(data == null){
        this.httpClient.post('http://localhost:8080/customer/' + this.views.titlenameTypeSelect + '/' + this.views.nametInput + '/' + this.views.sexTypeSelect
        + '/' + this.views.idcardInput + '/' + this.views.addressInput + '/' + this.views.nationalityNameSelect + '/' + this.views.emailInput
        + '/' + this.views.phoneInput + '/' + this.views.userInput + '/' + this.views.passwordInput, this.views )
               .subscribe(
                   data => {
                       console.log('POST Request is successful', data);
                   },
                   error => {
                        console.log('Rrror', error);
                  }

               );
        alert("Successfully!!");
    }
    else{
        alert("Please enter a new email.!!");
    }
    });
  }
}