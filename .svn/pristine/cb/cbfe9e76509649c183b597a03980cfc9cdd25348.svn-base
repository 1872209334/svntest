/**
 * @fileoverview added by tsickle
 * @suppress {checkTypes} checked by tsc
 */
import { Directive, EventEmitter, Input, Output } from '@angular/core';
import { MapService } from '../providers/mapService';
import { isNumber } from '../helpers/object';
export class CanvasLayerComponent {
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
            .addOverlay((map) => {
            this.canvaslayer = new window.BMap.CanvasLayer(this.getOptions(this.options, map));
            return this.canvaslayer;
        })
            .then(() => {
            this.loaded.emit(this.canvaslayer);
        });
    }
    /**
     * @return {?}
     */
    ngOnDestroy() {
        this._service.removeOverlay(this.canvaslayer);
    }
    /**
     * @param {?} options
     * @param {?} map
     * @return {?}
     */
    getOptions(options, map) {
        if (!options) {
            return;
        }
        const /** @type {?} */ opts = {};
        if (isNumber(options.zIndex)) {
            opts.zIndex = options.zIndex;
        }
        if (options.paneName) {
            opts.paneName = options.paneName;
        }
        if (options.update) {
            opts.update = function () {
                return options.update(map, this.canvas);
            };
        }
        return opts;
    }
}
CanvasLayerComponent.decorators = [
    { type: Directive, args: [{
                selector: 'canvaslayer'
            },] },
];
/** @nocollapse */
CanvasLayerComponent.ctorParameters = () => [
    { type: MapService, },
];
CanvasLayerComponent.propDecorators = {
    "options": [{ type: Input },],
    "loaded": [{ type: Output },],
};
function CanvasLayerComponent_tsickle_Closure_declarations() {
    /** @type {!Array<{type: !Function, args: (undefined|!Array<?>)}>} */
    CanvasLayerComponent.decorators;
    /**
     * @nocollapse
     * @type {function(): !Array<(null|{type: ?, decorators: (undefined|!Array<{type: !Function, args: (undefined|!Array<?>)}>)})>}
     */
    CanvasLayerComponent.ctorParameters;
    /** @type {!Object<string,!Array<{type: !Function, args: (undefined|!Array<?>)}>>} */
    CanvasLayerComponent.propDecorators;
    /** @type {?} */
    CanvasLayerComponent.prototype.options;
    /** @type {?} */
    CanvasLayerComponent.prototype.loaded;
    /** @type {?} */
    CanvasLayerComponent.prototype.canvaslayer;
    /** @type {?} */
    CanvasLayerComponent.prototype._service;
}

//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiY2FudmFzbGF5ZXIuY29tcG9uZW50LmpzIiwic291cmNlUm9vdCI6Im5nOi8vYW5ndWxhcjItYmFpZHUtbWFwLyIsInNvdXJjZXMiOlsiY29tcG9uZW50cy9jYW52YXNsYXllci5jb21wb25lbnQudHMiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7OztBQUFBLE9BQU8sRUFBRSxTQUFTLEVBQUUsWUFBWSxFQUFFLEtBQUssRUFBcUIsTUFBTSxFQUFFLE1BQU0sZUFBZSxDQUFBO0FBRXpGLE9BQU8sRUFBRSxVQUFVLEVBQUUsTUFBTSx5QkFBeUIsQ0FBQTtBQUVwRCxPQUFPLEVBQUUsUUFBUSxFQUFFLE1BQU0sbUJBQW1CLENBQUE7QUFNNUMsTUFBTTs7OztJQVNKLFlBQW9CLFFBQW9CO1FBQXBCLGFBQVEsR0FBUixRQUFRLENBQVk7c0JBSnZCLElBQUksWUFBWSxFQUFFO0tBSVM7Ozs7SUFFckMsUUFBUTtRQUNiLElBQUksQ0FBQyxRQUFRO2FBQ1YsVUFBVSxDQUFDLENBQUMsR0FBaUIsRUFBRSxFQUFFO1lBQ2hDLElBQUksQ0FBQyxXQUFXLEdBQUcsSUFBSSxNQUFNLENBQUMsSUFBSSxDQUFDLFdBQVcsQ0FBQyxJQUFJLENBQUMsVUFBVSxDQUFDLElBQUksQ0FBQyxPQUFPLEVBQUUsR0FBRyxDQUFDLENBQUMsQ0FBQTtZQUNsRixNQUFNLENBQUMsSUFBSSxDQUFDLFdBQVcsQ0FBQTtTQUN4QixDQUFDO2FBQ0QsSUFBSSxDQUFDLEdBQUcsRUFBRTtZQUNULElBQUksQ0FBQyxNQUFNLENBQUMsSUFBSSxDQUFDLElBQUksQ0FBQyxXQUFXLENBQUMsQ0FBQTtTQUNuQyxDQUFDLENBQUE7Ozs7O0lBR0MsV0FBVztRQUNoQixJQUFJLENBQUMsUUFBUSxDQUFDLGFBQWEsQ0FBQyxJQUFJLENBQUMsV0FBVyxDQUFDLENBQUE7Ozs7Ozs7SUFHdkMsVUFBVSxDQUFDLE9BQTJCLEVBQUUsR0FBaUI7UUFDL0QsRUFBRSxDQUFDLENBQUMsQ0FBQyxPQUFPLENBQUMsQ0FBQyxDQUFDO1lBQ2IsTUFBTSxDQUFBO1NBQ1A7UUFDRCx1QkFBTSxJQUFJLEdBQXdCLEVBQUUsQ0FBQTtRQUVwQyxFQUFFLENBQUMsQ0FBQyxRQUFRLENBQUMsT0FBTyxDQUFDLE1BQU0sQ0FBQyxDQUFDLENBQUMsQ0FBQztZQUM3QixJQUFJLENBQUMsTUFBTSxHQUFHLE9BQU8sQ0FBQyxNQUFNLENBQUE7U0FDN0I7UUFDRCxFQUFFLENBQUMsQ0FBQyxPQUFPLENBQUMsUUFBUSxDQUFDLENBQUMsQ0FBQztZQUNyQixJQUFJLENBQUMsUUFBUSxHQUFHLE9BQU8sQ0FBQyxRQUFRLENBQUE7U0FDakM7UUFDRCxFQUFFLENBQUMsQ0FBQyxPQUFPLENBQUMsTUFBTSxDQUFDLENBQUMsQ0FBQztZQUNuQixJQUFJLENBQUMsTUFBTSxHQUFHO2dCQUNaLE1BQU0sQ0FBQyxPQUFPLENBQUMsTUFBTSxDQUFDLEdBQUcsRUFBRSxJQUFJLENBQUMsTUFBTSxDQUFDLENBQUE7YUFDeEMsQ0FBQTtTQUNGO1FBRUQsTUFBTSxDQUFDLElBQUksQ0FBQTs7OztZQS9DZCxTQUFTLFNBQUM7Z0JBQ1QsUUFBUSxFQUFFLGFBQWE7YUFDeEI7Ozs7WUFQUSxVQUFVOzs7d0JBU2hCLEtBQUs7dUJBR0wsTUFBTSIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IERpcmVjdGl2ZSwgRXZlbnRFbWl0dGVyLCBJbnB1dCwgT25EZXN0cm95LCBPbkluaXQsIE91dHB1dCB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5cbmltcG9ydCB7IE1hcFNlcnZpY2UgfSBmcm9tICcuLi9wcm92aWRlcnMvbWFwU2VydmljZSdcbmltcG9ydCB7IEJDYW52YXNMYXllciwgQ2FudmFzTGF5ZXJPcHRpb25zLCBCQ2FudmFzTGF5ZXJPcHRpb25zIH0gZnJvbSAnLi4vdHlwZXMvQ2FudmFzTGF5ZXInXG5pbXBvcnQgeyBpc051bWJlciB9IGZyb20gJy4uL2hlbHBlcnMvb2JqZWN0J1xuaW1wb3J0IHsgQk1hcEluc3RhbmNlIH0gZnJvbSAnLi4vdHlwZXMvTWFwJ1xuXG5ARGlyZWN0aXZlKHtcbiAgc2VsZWN0b3I6ICdjYW52YXNsYXllcidcbn0pXG5leHBvcnQgY2xhc3MgQ2FudmFzTGF5ZXJDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uRGVzdHJveSB7XG4gIEBJbnB1dCgpXG4gIHByaXZhdGUgb3B0aW9uczogQ2FudmFzTGF5ZXJPcHRpb25zXG5cbiAgQE91dHB1dCgpXG4gIHByaXZhdGUgbG9hZGVkID0gbmV3IEV2ZW50RW1pdHRlcigpXG5cbiAgcHJpdmF0ZSBjYW52YXNsYXllcjogQkNhbnZhc0xheWVyXG5cbiAgY29uc3RydWN0b3IocHJpdmF0ZSBfc2VydmljZTogTWFwU2VydmljZSkge31cblxuICBwdWJsaWMgbmdPbkluaXQoKSB7XG4gICAgdGhpcy5fc2VydmljZVxuICAgICAgLmFkZE92ZXJsYXkoKG1hcDogQk1hcEluc3RhbmNlKSA9PiB7XG4gICAgICAgIHRoaXMuY2FudmFzbGF5ZXIgPSBuZXcgd2luZG93LkJNYXAuQ2FudmFzTGF5ZXIodGhpcy5nZXRPcHRpb25zKHRoaXMub3B0aW9ucywgbWFwKSlcbiAgICAgICAgcmV0dXJuIHRoaXMuY2FudmFzbGF5ZXJcbiAgICAgIH0pXG4gICAgICAudGhlbigoKSA9PiB7XG4gICAgICAgIHRoaXMubG9hZGVkLmVtaXQodGhpcy5jYW52YXNsYXllcilcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkRlc3Ryb3koKSB7XG4gICAgdGhpcy5fc2VydmljZS5yZW1vdmVPdmVybGF5KHRoaXMuY2FudmFzbGF5ZXIpXG4gIH1cblxuICBwcml2YXRlIGdldE9wdGlvbnMob3B0aW9uczogQ2FudmFzTGF5ZXJPcHRpb25zLCBtYXA6IEJNYXBJbnN0YW5jZSk6IEJDYW52YXNMYXllck9wdGlvbnMgfCB1bmRlZmluZWQge1xuICAgIGlmICghb3B0aW9ucykge1xuICAgICAgcmV0dXJuXG4gICAgfVxuICAgIGNvbnN0IG9wdHM6IEJDYW52YXNMYXllck9wdGlvbnMgPSB7fVxuXG4gICAgaWYgKGlzTnVtYmVyKG9wdGlvbnMuekluZGV4KSkge1xuICAgICAgb3B0cy56SW5kZXggPSBvcHRpb25zLnpJbmRleFxuICAgIH1cbiAgICBpZiAob3B0aW9ucy5wYW5lTmFtZSkge1xuICAgICAgb3B0cy5wYW5lTmFtZSA9IG9wdGlvbnMucGFuZU5hbWVcbiAgICB9XG4gICAgaWYgKG9wdGlvbnMudXBkYXRlKSB7XG4gICAgICBvcHRzLnVwZGF0ZSA9IGZ1bmN0aW9uKCkge1xuICAgICAgICByZXR1cm4gb3B0aW9ucy51cGRhdGUobWFwLCB0aGlzLmNhbnZhcylcbiAgICAgIH1cbiAgICB9XG5cbiAgICByZXR1cm4gb3B0c1xuICB9XG59XG4iXX0=