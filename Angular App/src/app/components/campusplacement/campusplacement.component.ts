import { Component, OnInit } from '@angular/core';

import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-campusplacement',
  templateUrl: './campusplacement.component.html',
  styleUrls: ['./campusplacement.component.css']
})
export class CampusplacementComponent implements OnInit {

  constructor(public http:HttpClient) { }

  branches=["A+","A-","B+","B-","O+","O-","AB+","AB-"];

var_name=""
var_email=""
var_branch=""


register_clickHandler(){
  //here we will prepare a json object
  //which we will be sending to spring 
  //boot application (later)

  var applicant ={
    "id":this.var_name,
    "title":this.var_email,
    "description":this.var_branch
  }

 //request: get | post?

 this.http.post<any>("http://localhost:8080/movies",applicant).subscribe(data=>{
   //this data variable will contain response from the server...
   //in our case it is null.r

   alert('Data Sent succesfully!')
 });

}

  ngOnInit(): void {
  }

}
