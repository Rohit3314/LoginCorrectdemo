import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private s1:DemoService) 
  { }

  ngOnInit(): void {
  }
  insertdata(customerform:any)
  {
     return this.s1.insertdata1(customerform.value).subscribe();
  }

}
