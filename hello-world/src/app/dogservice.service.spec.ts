import { TestBed } from '@angular/core/testing';

import { DogserviceService } from './dogservice.service';

describe('DogserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DogserviceService = TestBed.get(DogserviceService);
    expect(service).toBeTruthy();
  });
});
