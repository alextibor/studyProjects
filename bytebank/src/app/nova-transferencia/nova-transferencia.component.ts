import { Component } from '@angular/core';

@Component({
  selector: 'app-nova-transferecia',
  templateUrl: './nova-transferencia.component.html',
  styleUrls: ['./nova-transferencia.component.scss'],
})
export class NovaTransferenciaComponent {
  transferir() {
    console.log('Solicitada nova transferecia');
  }
}
