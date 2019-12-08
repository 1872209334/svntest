/**
 * @fileoverview added by tsickle
 * @suppress {checkTypes} checked by tsc
 */
import { Directive, EventEmitter, Input, Output } from '@angular/core';
import { MapService } from '../providers/mapService';
export class TileLayerComponent {
    /**
     * @param {?} _service
     */
    constructor(_service) {
        this._service = _service;
        this.loaded = new EventEmitter();
    }
    /**
     * @return {?}
     */
    ngOnInit() {
        const /** @type {?} */ func = this.getTilesUrl;
        this._service
            .addTileLayer(() => {
            this.tilelayer = new window.BMap.TileLayer(this.options);
            if (this.getTilesUrl) {
                this.tilelayer.getTilesUrl = function (tileCoord, zoom) {
                    return func(tileCoord, zoom);
                };
            }
            return this.tilelayer;
        })
            .then(() => {
            this.loaded.emit(this.tilelayer);
        });
    }
    /**
     * @return {?}
     */
    ngOnDestroy() {
        this._service.removeTileLayer(this.tilelayer);
    }
}
TileLayerComponent.decorators = [
    { type: Directive, args: [{
                selector: 'tilelayer'
            },] },
];
/** @nocollapse */
TileLayerComponent.ctorParameters = () => [
    { type: MapService, },
];
TileLayerComponent.propDecorators = {
    "getTilesUrl": [{ type: Input },],
    "options": [{ type: Input },],
    "loaded": [{ type: Output },],
};
function TileLayerComponent_tsickle_Closure_declarations() {
    /** @type {!Array<{type: !Function, args: (undefined|!Array<?>)}>} */
    TileLayerComponent.decorators;
    /**
     * @nocollapse
     * @type {function(): !Array<(null|{type: ?, decorators: (undefined|!Array<{type: !Function, args: (undefined|!Array<?>)}>)})>}
     */
    TileLayerComponent.ctorParameters;
    /** @type {!Object<string,!Array<{type: !Function, args: (undefined|!Array<?>)}>>} */
    TileLayerComponent.propDecorators;
    /** @type {?} */
    TileLayerComponent.prototype.getTilesUrl;
    /** @type {?} */
    TileLayerComponent.prototype.options;
    /** @type {?} */
    TileLayerComponent.prototype.loaded;
    /** @type {?} */
    TileLayerComponent.prototype.tilelayer;
    /** @type {?} */
    TileLayerComponent.prototype._service;
}

//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoidGlsZWxheWVyLmNvbXBvbmVudC5qcyIsInNvdXJjZVJvb3QiOiJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC8iLCJzb3VyY2VzIjpbImNvbXBvbmVudHMvdGlsZWxheWVyLmNvbXBvbmVudC50cyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7O0FBQUEsT0FBTyxFQUFFLFNBQVMsRUFBRSxZQUFZLEVBQUUsS0FBSyxFQUFxQixNQUFNLEVBQUUsTUFBTSxlQUFlLENBQUE7QUFFekYsT0FBTyxFQUFFLFVBQVUsRUFBRSxNQUFNLHlCQUF5QixDQUFBO0FBT3BELE1BQU07Ozs7SUFXSixZQUFvQixRQUFvQjtRQUFwQixhQUFRLEdBQVIsUUFBUSxDQUFZO3NCQUp2QixJQUFJLFlBQVksRUFBRTtLQUlTOzs7O0lBRXJDLFFBQVE7UUFDYix1QkFBTSxJQUFJLEdBQUcsSUFBSSxDQUFDLFdBQVcsQ0FBQTtRQUU3QixJQUFJLENBQUMsUUFBUTthQUNWLFlBQVksQ0FBQyxHQUFHLEVBQUU7WUFDakIsSUFBSSxDQUFDLFNBQVMsR0FBRyxJQUFJLE1BQU0sQ0FBQyxJQUFJLENBQUMsU0FBUyxDQUFDLElBQUksQ0FBQyxPQUFPLENBQUMsQ0FBQTtZQUV4RCxFQUFFLENBQUMsQ0FBQyxJQUFJLENBQUMsV0FBVyxDQUFDLENBQUMsQ0FBQztnQkFDckIsSUFBSSxDQUFDLFNBQVMsQ0FBQyxXQUFXLEdBQUcsVUFBUyxTQUFpQixFQUFFLElBQVk7b0JBQ25FLE1BQU0sQ0FBQyxJQUFJLENBQUMsU0FBUyxFQUFFLElBQUksQ0FBQyxDQUFBO2lCQUM3QixDQUFBO2FBQ0Y7WUFDRCxNQUFNLENBQUMsSUFBSSxDQUFDLFNBQVMsQ0FBQTtTQUN0QixDQUFDO2FBQ0QsSUFBSSxDQUFDLEdBQUcsRUFBRTtZQUNULElBQUksQ0FBQyxNQUFNLENBQUMsSUFBSSxDQUFDLElBQUksQ0FBQyxTQUFTLENBQUMsQ0FBQTtTQUNqQyxDQUFDLENBQUE7Ozs7O0lBR0MsV0FBVztRQUNoQixJQUFJLENBQUMsUUFBUSxDQUFDLGVBQWUsQ0FBQyxJQUFJLENBQUMsU0FBUyxDQUFDLENBQUE7Ozs7WUFwQ2hELFNBQVMsU0FBQztnQkFDVCxRQUFRLEVBQUUsV0FBVzthQUN0Qjs7OztZQU5RLFVBQVU7Ozs0QkFRaEIsS0FBSzt3QkFFTCxLQUFLO3VCQUdMLE1BQU0iLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBEaXJlY3RpdmUsIEV2ZW50RW1pdHRlciwgSW5wdXQsIE9uRGVzdHJveSwgT25Jbml0LCBPdXRwdXQgfSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQgeyBNYXBTZXJ2aWNlIH0gZnJvbSAnLi4vcHJvdmlkZXJzL21hcFNlcnZpY2UnXG5pbXBvcnQgeyBCVGlsZUxheWVyLCBUaWxlTGF5ZXJPcHRpb25zLCBnZXRUaWxlc1VybEZ1bmMgfSBmcm9tICcuLi90eXBlcy9UaWxlTGF5ZXInXG5pbXBvcnQgeyBCUGl4ZWwgfSBmcm9tICcuLi90eXBlcy9QaXhlbCdcblxuQERpcmVjdGl2ZSh7XG4gIHNlbGVjdG9yOiAndGlsZWxheWVyJ1xufSlcbmV4cG9ydCBjbGFzcyBUaWxlTGF5ZXJDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uRGVzdHJveSB7XG4gIEBJbnB1dCgpXG4gIHByaXZhdGUgZ2V0VGlsZXNVcmw6IGdldFRpbGVzVXJsRnVuY1xuICBASW5wdXQoKVxuICBwcml2YXRlIG9wdGlvbnM6IFRpbGVMYXllck9wdGlvbnNcblxuICBAT3V0cHV0KClcbiAgcHJpdmF0ZSBsb2FkZWQgPSBuZXcgRXZlbnRFbWl0dGVyKClcblxuICBwcml2YXRlIHRpbGVsYXllcjogQlRpbGVMYXllclxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIGNvbnN0IGZ1bmMgPSB0aGlzLmdldFRpbGVzVXJsXG5cbiAgICB0aGlzLl9zZXJ2aWNlXG4gICAgICAuYWRkVGlsZUxheWVyKCgpID0+IHtcbiAgICAgICAgdGhpcy50aWxlbGF5ZXIgPSBuZXcgd2luZG93LkJNYXAuVGlsZUxheWVyKHRoaXMub3B0aW9ucylcblxuICAgICAgICBpZiAodGhpcy5nZXRUaWxlc1VybCkge1xuICAgICAgICAgIHRoaXMudGlsZWxheWVyLmdldFRpbGVzVXJsID0gZnVuY3Rpb24odGlsZUNvb3JkOiBCUGl4ZWwsIHpvb206IG51bWJlcikge1xuICAgICAgICAgICAgcmV0dXJuIGZ1bmModGlsZUNvb3JkLCB6b29tKVxuICAgICAgICAgIH1cbiAgICAgICAgfVxuICAgICAgICByZXR1cm4gdGhpcy50aWxlbGF5ZXJcbiAgICAgIH0pXG4gICAgICAudGhlbigoKSA9PiB7XG4gICAgICAgIHRoaXMubG9hZGVkLmVtaXQodGhpcy50aWxlbGF5ZXIpXG4gICAgICB9KVxuICB9XG5cbiAgcHVibGljIG5nT25EZXN0cm95KCkge1xuICAgIHRoaXMuX3NlcnZpY2UucmVtb3ZlVGlsZUxheWVyKHRoaXMudGlsZWxheWVyKVxuICB9XG59XG4iXX0=