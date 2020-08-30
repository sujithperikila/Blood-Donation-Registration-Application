import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-campusreport',
  templateUrl: './campusreport.component.html',
  styleUrls: ['./campusreport.component.css']
})
export class CampusreportComponent implements OnInit {

  constructor(public http:HttpClient) { }

  msg="";
  generateReport(){
    
    this.http.get("http://localhost:8080/movies").subscribe(data=>{
      // alert(JSON.stringify(data));
      
      for(var index in data){
        this.msg+="<b>Name</b> :"+data[index].id+" <b>| Contact: </b>  "+data[index].title+" <b>| Blood Type :</b>" +data[index].description +"<br/>";
      }

    })

  }

  ngOnInit(): void {
  }

}
