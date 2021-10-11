import { Component, Output } from '@angular/core';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-nova-transferecia',
  templateUrl: './nova-transferencia.component.html',
  styleUrls: ['./nova-transferencia.component.scss'],
})
export class NovaTransferenciaComponent {

  @Output() aoTranferir = new EventEmitter<any>();

  valor: number = 0;
  destino: number = 0;

  transferir() {
    console.log('Solicitada nova transferecia');
    const valorEmitir = {valor: this.valor, destino: this.destino}
    this.aoTranferir.emit(valorEmitir);
  }
}
