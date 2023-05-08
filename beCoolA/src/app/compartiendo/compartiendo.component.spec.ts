import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompartiendoComponent } from './compartiendo.component';

describe('CompartiendoComponent', () => {
  let component: CompartiendoComponent;
  let fixture: ComponentFixture<CompartiendoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompartiendoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CompartiendoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
