import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderFormat'
})
export class GenderPipe implements PipeTransform {

  transform(value: string, gen: String): string {
    if( gen == 'Male'){
      return 'Mr.' +value;
    }
    else{
      return 'Mrs.' + value;
    }
  
  }

}
