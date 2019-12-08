/**
 * @fileoverview added by tsickle
 * @suppress {checkTypes} checked by tsc
 */
import { Directive, EventEmitter, Input, Output } from '@angular/core';
import { MapService } from '../providers/mapService';
export class TrafficLayerComponent {
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
        this._service
            .addTileLayer(() => {
            this.trafficlayer = new window.BMap.TrafficLayer(this.options);
            return this.trafficlayer;
        })
            .then(() => {
            this.loaded.emit(this.trafficlayer);
        });
    }
    /**
     * @return {?}
     */
    ngOnDestroy() {
        this._service.removeTileLayer(this.trafficlayer);
    }
}
TrafficLayerComponent.decorators = [
    { type: Directive, args: [{
                selector: 'trafficlayer'
            },] },
];
/** @nocollapse */
TrafficLayerComponent.ctorParameters = () => [
    { type: MapService, },
];
TrafficLayerComponent.propDecorators = {
    "options": [{ type: Input },],
    "loaded": [{ type: Output },],
};
function TrafficLayerComponent_tsickle_Closure_declarations() {
    /** @type {!Array<{type: !Function, args: (undefined|!Array<?>)}>} */
    TrafficLayerComponent.decorators;
    /**
     * @nocollapse
     * @type {function(): !Array<(null|{type: ?, decorators: (undefined|!Array<{type: !Function, args: (undefined|!Array<?>)}>)})>}
     */
    TrafficLayerComponent.ctorParameters;
    /** @type {!Object<string,!Array<{type: !Function, args: (undefined|!Array<?>)}>>} */
    TrafficLayerComponent.propDecorators;
    /** @type {?} */
    TrafficLayerComponent.prototype.options;
    /** @type {?} */
    TrafficLayerComponent.prototype.loaded;
    /** @type {?} */
    TrafficLayerComponent.prototype.trafficlayer;
    /** @type {?} */
    TrafficLayerComponent.prototype._service;
}

//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoidHJhZmZpY2xheWVyLmNvbXBvbmVudC5qcyIsInNvdXJjZVJvb3QiOiJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC8iLCJzb3VyY2VzIjpbImNvbXBvbmVudHMvdHJhZmZpY2xheWVyLmNvbXBvbmVudC50cyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7O0FBQUEsT0FBTyxFQUFFLFNBQVMsRUFBRSxZQUFZLEVBQUUsS0FBSyxFQUFxQixNQUFNLEVBQUUsTUFBTSxlQUFlLENBQUE7QUFFekYsT0FBTyxFQUFFLFVBQVUsRUFBRSxNQUFNLHlCQUF5QixDQUFBO0FBTXBELE1BQU07Ozs7SUFTSixZQUFvQixRQUFvQjtRQUFwQixhQUFRLEdBQVIsUUFBUSxDQUFZO3NCQUp2QixJQUFJLFlBQVksRUFBRTtLQUlTOzs7O0lBRXJDLFFBQVE7UUFDYixJQUFJLENBQUMsUUFBUTthQUNWLFlBQVksQ0FBQyxHQUFHLEVBQUU7WUFDakIsSUFBSSxDQUFDLFlBQVksR0FBRyxJQUFJLE1BQU0sQ0FBQyxJQUFJLENBQUMsWUFBWSxDQUFDLElBQUksQ0FBQyxPQUFPLENBQUMsQ0FBQTtZQUM5RCxNQUFNLENBQUMsSUFBSSxDQUFDLFlBQVksQ0FBQTtTQUN6QixDQUFDO2FBQ0QsSUFBSSxDQUFDLEdBQUcsRUFBRTtZQUNULElBQUksQ0FBQyxNQUFNLENBQUMsSUFBSSxDQUFDLElBQUksQ0FBQyxZQUFZLENBQUMsQ0FBQTtTQUNwQyxDQUFDLENBQUE7Ozs7O0lBR0MsV0FBVztRQUNoQixJQUFJLENBQUMsUUFBUSxDQUFDLGVBQWUsQ0FBQyxJQUFJLENBQUMsWUFBWSxDQUFDLENBQUE7Ozs7WUExQm5ELFNBQVMsU0FBQztnQkFDVCxRQUFRLEVBQUUsY0FBYzthQUN6Qjs7OztZQUxRLFVBQVU7Ozt3QkFPaEIsS0FBSzt1QkFHTCxNQUFNIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgRGlyZWN0aXZlLCBFdmVudEVtaXR0ZXIsIElucHV0LCBPbkRlc3Ryb3ksIE9uSW5pdCwgT3V0cHV0IH0gZnJvbSAnQGFuZ3VsYXIvY29yZSdcblxuaW1wb3J0IHsgTWFwU2VydmljZSB9IGZyb20gJy4uL3Byb3ZpZGVycy9tYXBTZXJ2aWNlJ1xuaW1wb3J0IHsgQlRyYWZmaWNMYXllciwgVHJhZmZpY0xheWVyT3B0aW9ucyB9IGZyb20gJy4uL3R5cGVzL1RyYWZmaWNMYXllcidcblxuQERpcmVjdGl2ZSh7XG4gIHNlbGVjdG9yOiAndHJhZmZpY2xheWVyJ1xufSlcbmV4cG9ydCBjbGFzcyBUcmFmZmljTGF5ZXJDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uRGVzdHJveSB7XG4gIEBJbnB1dCgpXG4gIHByaXZhdGUgb3B0aW9uczogVHJhZmZpY0xheWVyT3B0aW9uc1xuXG4gIEBPdXRwdXQoKVxuICBwcml2YXRlIGxvYWRlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuXG4gIHByaXZhdGUgdHJhZmZpY2xheWVyOiBCVHJhZmZpY0xheWVyXG5cbiAgY29uc3RydWN0b3IocHJpdmF0ZSBfc2VydmljZTogTWFwU2VydmljZSkge31cblxuICBwdWJsaWMgbmdPbkluaXQoKSB7XG4gICAgdGhpcy5fc2VydmljZVxuICAgICAgLmFkZFRpbGVMYXllcigoKSA9PiB7XG4gICAgICAgIHRoaXMudHJhZmZpY2xheWVyID0gbmV3IHdpbmRvdy5CTWFwLlRyYWZmaWNMYXllcih0aGlzLm9wdGlvbnMpXG4gICAgICAgIHJldHVybiB0aGlzLnRyYWZmaWNsYXllclxuICAgICAgfSlcbiAgICAgIC50aGVuKCgpID0+IHtcbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdCh0aGlzLnRyYWZmaWNsYXllcilcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkRlc3Ryb3koKSB7XG4gICAgdGhpcy5fc2VydmljZS5yZW1vdmVUaWxlTGF5ZXIodGhpcy50cmFmZmljbGF5ZXIpXG4gIH1cbn1cbiJdfQ==