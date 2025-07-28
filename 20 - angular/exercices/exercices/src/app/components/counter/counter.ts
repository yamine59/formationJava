import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  imports: [],
  templateUrl: './counter.html',
  styleUrl: './counter.css'
})
export class Counter {
  count : number = 5
  
  incrementer():void{
    this.count+=1
  }
  decrementer(): void {
    this.count-=1
  }
}
