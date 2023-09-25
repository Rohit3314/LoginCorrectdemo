import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private s1:DemoService) 
  { }
       user :User = new User();
  ngOnInit(): void {
  }
     link:string="";
          logindata()
          {
              this.s1.logindata1(this.user).subscribe( data=>
               {this.link="/insert",alert("login Successful")},
               error=>alert("invalid id/pswd")
              );
          }
}
