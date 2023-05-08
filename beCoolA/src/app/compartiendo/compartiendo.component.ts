import { Component } from '@angular/core';
import { idea } from '../core/models/idea.model';
import { faEye, faComment, faChevronLeft, faChevronRight } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-compartiendo',
  templateUrl: './compartiendo.component.html',
  styleUrls: ['./compartiendo.component.css']
})
export class CompartiendoComponent {
  faEye = faEye;
  faComment = faComment;
  faRight = faChevronRight;
  faLeft = faChevronLeft;
  ideas: idea[] = [
    {
      url:'https://bootdey.com/img/Content/avatar/avatar4.png',
      title:'Titulo de discusión',
      user:'Juan',
      time:13,
      view: 19,
      comments: 5,
    },
    {
      url:'https://bootdey.com/img/Content/avatar/avatar3.png',
      title:'Titulo de discusión',
      user:'Dani',
      time:3,
      view: 14,
      comments: 5,
    },
    {
      url:'https://bootdey.com/img/Content/avatar/avatar2.png',
      title:'Titulo de discusión',
      user:'Sara',
      time:7,
      view: 30,
      comments: 8,
    },
    {
      url:'https://bootdey.com/img/Content/avatar/avatar1.png',
      title:'Titulo de discusión',
      user:'Carlos',
      time:14,
      view: 4,
      comments: 10,
    },
  ]
}
