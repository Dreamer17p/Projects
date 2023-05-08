import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css']
})
export class InputComponent {
  @Output() add: EventEmitter<any> = new EventEmitter();

  text: string = "";

  agregar() {
    this.add.emit(this.text)
  }

}
